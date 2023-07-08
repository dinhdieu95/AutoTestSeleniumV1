package run.db;

import database.entity.Employee;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import java.util.Iterator;
import java.util.List;

public class ManageEmployee {
    private static SessionFactory factory;

    public static void main(String[] args) {

        try {
            factory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
        } catch (Throwable ex) {
            System.err.println("Failed to create sessionFactory object." + ex);
            throw new ExceptionInInitializerError(ex);
        }

        ManageEmployee ME = new ManageEmployee();
//
//        /* Add few employee records in database */
//        Integer empID1 = ME.addEmployee(1, "Zara", "Ali", 1000);
//        Integer empID2 = ME.addEmployee(2, "Daisy", "Das", 5000);
//        Integer empID3 = ME.addEmployee(3, "John", "Paul", 10000);
//
//        System.out.println("List down all the employees");
//        /* List down all the employees */
//        ME.listEmployees();
//
//        /* Update employee's records */
//        ME.updateEmployee(empID1, 5000);
//
//        /* Delete an employee from the database */
//        ME.deleteEmployee(empID2);
//
//        /* List down new list of the employees */
//        ME.listEmployees();

        ME.getLístEmployes();

    }

    /* Method to CREATE an employee in the database */
    public Integer addEmployee(int id, String fname, String lname, int salary) {
        Session session = factory.openSession();
        Transaction tx = null;
        Integer employeeID = null;

        try {
            tx = session.beginTransaction();
            Employee employee = new Employee(id, fname, lname, salary);
            employeeID = (Integer) session.save(employee); // saveOrUpdate
//            employeeID = (Integer) session.save("Employee", employee);// saveOrUpdate
            tx.commit();
        } catch (HibernateException e) {
            if (tx != null) tx.rollback();
            e.printStackTrace();
        } finally {
            session.close();
        }
        return employeeID;
    }

    /* Method to  READ all the employees */
    public void listEmployees() {
        Session session = factory.openSession();
        Transaction tx = null;

        try {
            tx = session.beginTransaction();
            System.out.println("==List employee ==");
            Query sql = session.createQuery("FROM Employee");
            // câu lênh truy vấn DB
            List employees = sql.list(); // thể hiện đặc thù của hibernate  hQL
            sql.setHint("org.hibernate.cacheable", true);//bật tính năng cache cho truy vấn level 2

            for (Iterator iterator = employees.iterator(); iterator.hasNext(); ) {
                Employee employee = (Employee) iterator.next();
                System.out.print("First Name: " + employee.getFirstName());
                System.out.print("  Last Name: " + employee.getLastName());
                System.out.println("  Salary: " + employee.getSalary());
            }

            // get cache level 2
            System.out.println(findById(2).toString());
//  sử dụng Ehcache để tạo và quản lý cache.
//  thời gian sống của mục trong cache
//  Ehcache -> kiểm tra xem dữ liệu có trong cache -> có lấy trong cache -> không lấy trong DB
//  bình thường hay có lỗi kiểmtra trong DB ko còn dữ liệu mà app vẫn trả ra
//  => ( có thể do cơ chế cache này)
            tx.commit();
        } catch (HibernateException e) {
            if (tx != null) tx.rollback();
            e.printStackTrace();
        } finally {
            session.close();
        }
    }

    public Employee findById(Integer id) {
        Session session = factory.getCurrentSession();
        Employee employee = session.get(Employee.class, id);
        return employee;
    }
    public void getLístEmployes() {
        Session session = factory.openSession();

        getEmployeeById(1, session);
        getEmployeeById(3, session);

        System.out.println(session.getCacheMode());
        Employee cache = session.load(Employee.class, new Integer(3));
        System.out.println(cache.toString());
        session.close();

        System.out.println(session.load(Employee.class, new Integer(3)));

    }

    public void getEmployeeById(Integer id, Session session) {
        Transaction tx = null;
        try {
            if (!session.getTransaction().isActive() ) {
                tx = session.getTransaction();
            }
            Employee employee = session.get(Employee.class, id); // hàm này ở level 1 cache
            System.out.println(employee.toString());
        } catch (HibernateException e) {
            if (tx != null) tx.rollback();
            e.printStackTrace();
        }
    }

    public void getNativeQuery() {
        Session session = factory.openSession();
        Transaction tx = null;

        try {
            tx = session.beginTransaction();
            System.out.println("==List employee ==");
// Bật mức độ câu truy vấn caching cho truy vấn = mức độ 1
            Query data = session.createNativeQuery("SELECT * FROM EMPLOYEE", Employee.class); // sử dụng truy vấn như 1 công cụ bình thường  sql
            data.setCacheable(true);

            System.out.println(data.getCacheRegion());

            // câu lênh truy vấn DB
            // Lấy danh sách Employee từ cache (nếu có) hoặc từ cơ sở dữ liệu
            List employees = data.getResultList();

            System.out.println(" list native query: ");
            for (Iterator iterator = employees.iterator(); iterator.hasNext(); ) {
                Employee employee = (Employee) iterator.next();
                System.out.print("First Name: " + employee.getFirstName());
                System.out.print("  Last Name: " + employee.getLastName());
                System.out.println("  Salary: " + employee.getSalary());
            }
            System.out.println(data.getCacheMode());
            System.out.println(data.getCacheRegion());

            tx.commit();
        } catch (HibernateException e) {
            if (tx != null) tx.rollback();
            e.printStackTrace();
        } finally {

            System.out.println(session.getCacheMode());
            Employee cache = session.load(Employee.class, new Integer(1));
            System.out.println(cache.toString());

            session.close();
        }
    }

    /* Method to UPDATE salary for an employee */
    public void updateEmployee(Integer EmployeeID, int salary) {
        Session session = factory.openSession();
        Transaction tx = null;

        try {
            tx = session.beginTransaction();
            Employee employee = session.get(Employee.class, EmployeeID);
            employee.setSalary(salary);
            session.update(employee); // saveOrUpdate => có thể thực hiện hàm update của mình
//            session.update("Employee", employee);
            tx.commit();
        } catch (HibernateException e) {
            if (tx != null) tx.rollback();
            e.printStackTrace();
        } finally {
            session.close();
        }
    }

    /* Method to DELETE an employee from the records */
    public void deleteEmployee(Integer EmployeeID) {
        Session session = factory.openSession();
        Transaction tx = null;

        try {
            tx = session.beginTransaction();
            Employee employee = (Employee) session.get(Employee.class, EmployeeID);
            session.delete(employee); // cách 2:  delete ("Employee", employee);
            tx.commit();
        } catch (HibernateException e) {
            if (tx != null) tx.rollback();
            e.printStackTrace();
        } finally {
            session.close();
        }
    }
}
