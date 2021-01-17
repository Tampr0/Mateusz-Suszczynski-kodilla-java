package com.kodilla.hibernate.manytomany.dao.facade;

import com.kodilla.hibernate.manytomany.Company;
import com.kodilla.hibernate.manytomany.Employee;
import com.kodilla.hibernate.manytomany.dao.CompanyDao;
import com.kodilla.hibernate.manytomany.dao.EmployeeDao;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class FacadeTestSuite {

    @Autowired
    private CompanyDao companyDao;
    @Autowired
    private EmployeeDao employeeDao;

    @Test
    public void testSearchForCompanyWithAnyFragmentOfName() {
        //Given
        Employee johnSmith = new Employee("John", "Smith");
        Employee stepanieClarkson = new Employee("Stephanie", "Clarkson");
        Employee lindaKovalsky = new Employee("Linda", "Kovalsky");

        Company softwareMachine = new Company("Software Machine");
        Company dataMaesters = new Company("Data Maesters");
        Company greyMatter = new Company("Grey Matters");

        softwareMachine.getEmployees().add(johnSmith);
        dataMaesters.getEmployees().add(stepanieClarkson);
        dataMaesters.getEmployees().add(lindaKovalsky);
        greyMatter.getEmployees().add(johnSmith);
        greyMatter.getEmployees().add(lindaKovalsky);

        johnSmith.getCompanies().add(softwareMachine);
        johnSmith.getCompanies().add(greyMatter);
        stepanieClarkson.getCompanies().add(dataMaesters);
        lindaKovalsky.getCompanies().add(dataMaesters);
        lindaKovalsky.getCompanies().add(greyMatter);

        companyDao.save(softwareMachine);
        companyDao.save(dataMaesters);
        companyDao.save(greyMatter);

        //When
        List<Company> companyList = companyDao.findCompanyByAnyFragment("sof");
        List<Company> companyList2 = companyDao.findCompanyByAnyFragment("ttero");
        List<Employee> employeesList = employeeDao.findEmployeeByAnyFragment("ith");
        List<Employee> employeesList2 = employeeDao.findEmployeeByAnyFragment("inda");

        //Then
        Assert.assertEquals(1, companyList.size());
        Assert.assertEquals(0, companyList2.size());
        Assert.assertEquals(1, employeesList.size());
        Assert.assertEquals(1, employeesList2.size());


    }


}
