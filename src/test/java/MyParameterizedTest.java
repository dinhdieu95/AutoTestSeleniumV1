import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class MyParameterizedTest {
    private int id;
    private String first_name;
    private String last_name;
    private int salary;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
    @DataProvider(name = "testData")
    public Object[][] testData() throws IOException {
        List<Object[]> data = new ArrayList<>();

        FileReader fileReader = new FileReader(System.getProperty("user.dir") + "/src/test/resources/test_data.csv");
        // Read the CSV file
        BufferedReader reader = new BufferedReader(fileReader);

        // Read the column names from the first line (header)
        String headerLine = reader.readLine();
        String[] headers = headerLine.split("|");

        // Read the test data rows
        String dataLine;
        while ((dataLine = reader.readLine()) != null) {
            String[] values = dataLine.split("|");
            Object[] testData = new Object[values.length];

            // Convert each value to the appropriate data type
            for (int i = 0; i < values.length; i++) {
                String header = headers[i].trim();
                String value = values[i].trim();

                if (header.equalsIgnoreCase("id")) {
                    testData[i] = Integer.parseInt(value);
                } else if (header.equalsIgnoreCase("first_name")) {
                    testData[i] = value;
                } else if (header.equalsIgnoreCase("last_name")) {
                    testData[i] = value;
                } else if (header.equalsIgnoreCase("salary")) {
                    testData[i] = Integer.parseInt(value);
                }
            }

            data.add(testData);
        }

        reader.close();

        return data.toArray(new Object[data.size()][]);
    }
//    "|"
//    junit @UseCSVProvider
    @Test(dataProvider = "testData")
    public void testSomething(int id, String first_name, String last_name, int salary) {
        // Use the test data in your test logic
        System.out.println("Test case: ID=" + id + ", First Name=" + first_name + ", Last Name=" + last_name + ", Salary=" + salary);
        // ...
    }


}

