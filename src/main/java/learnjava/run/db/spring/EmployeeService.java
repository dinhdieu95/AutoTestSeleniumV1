package learnjava.run.db.spring;

import learnjava.database.entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import javax.sql.DataSource;
import java.util.List;

@Service
public class EmployeeService {

    private JdbcTemplate jdbcTemplate;

    @Autowired
    public EmployeeService(DataSource dataSource) {
        this.jdbcTemplate = new JdbcTemplate(dataSource);
    }

    public List<Employee> getAllEmployees() {
        String sql = "SELECT * FROM EMPLOYEE";
        return jdbcTemplate.query(sql, new EmployeeRowMapper());
    }
}
