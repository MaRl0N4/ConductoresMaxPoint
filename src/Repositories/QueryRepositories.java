package Repositories;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import Models.DriverMaxPoint;

public class QueryRepositories {

    String jdbcURL = "jdbc:postgresql://localhost:5432/Formula1N";
    String username = "postgres";
    String password = "admi123";

    public List<DriverMaxPoint> getDriversMaxPoints() {
        List<DriverMaxPoint> results = new ArrayList<>();

        String sql = "SELECT " +
                     "    d.forename || ' ' || d.surname AS driver_name, " +
                     "    SUM(r.points) AS total_points " +
                     "FROM " +
                     "    results r " +
                     "JOIN " +
                     "    drivers d ON r.driver_id = d.driver_id " +
                     "GROUP BY " +
                     "    d.forename, d.surname " +
                     "ORDER BY " +
                     "    total_points DESC " +
                     "LIMIT 10;";

        try (Connection conn = DriverManager.getConnection(jdbcURL, username, password);
             PreparedStatement statement = conn.prepareStatement(sql);
             ResultSet rs = statement.executeQuery()) {

            while (rs.next()) {
                String driverName = rs.getString("driver_name");
                float points = rs.getFloat("total_points");

                DriverMaxPoint result = new DriverMaxPoint(driverName, points);
                results.add(result);
            }

        } catch (Exception ex) {
            ex.printStackTrace();
        }

        return results;
    }

    
}
