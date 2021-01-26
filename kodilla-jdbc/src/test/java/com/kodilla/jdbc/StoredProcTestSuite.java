package com.kodilla.jdbc;

import org.junit.Assert;
import org.junit.Test;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class StoredProcTestSuite {
    @Test
    public void testUpdateVipLevels() throws SQLException {
        //Given
        DbManager dbManager = DbManager.getInstance();
        String sqlUpdate = "update readers set vip_level=\"Not set\"";
        Statement statement = dbManager.getConnection().createStatement();
        statement.executeUpdate(sqlUpdate);
        //when
        String sqlProcedureCall = "call UpdateVipLevels()";
        statement.execute(sqlProcedureCall);

        //then
        String sqlCheckTable = "select count(*) as how_many from readers where vip_level = \"Not set\"";
        ResultSet rs = statement.executeQuery(sqlCheckTable);
        int howMany = -1;
        if (rs.next()) {
            howMany = rs.getInt("HOW_MANY");
        }
        Assert.assertEquals(0,howMany);
    }

    @Test
    public void testUpdateBestsellers() throws SQLException {
        //Given
        DbManager dbManager = DbManager.getInstance();
        String sqlUpdate = "update books set bestseller = false";
        Statement statement = dbManager.getConnection().createStatement();
        statement.executeUpdate(sqlUpdate);

        //when
        String sqlProcedureCall = "call UpdateBestSellers()";
        statement.execute(sqlProcedureCall);

        //then
        String sqlCheckTable = "select count(*) as how_many from books where bestseller = false";
        ResultSet rs = statement.executeQuery(sqlCheckTable);
        int howMany = -1;
        if (rs.next()) {
            howMany = rs.getInt("how_many");
        }
        statement.close();
        rs.close();
        Assert.assertEquals(4, howMany);
    }
}
