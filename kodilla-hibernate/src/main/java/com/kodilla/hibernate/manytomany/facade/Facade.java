package com.kodilla.hibernate.manytomany.facade;

import com.kodilla.hibernate.manytomany.Company;
import com.kodilla.hibernate.manytomany.Employee;
import com.kodilla.hibernate.manytomany.dao.CompanyDao;
import com.kodilla.hibernate.manytomany.dao.EmployeeDao;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public final class Facade {

    @Autowired
    private CompanyDao companyDao;
    @Autowired
    private EmployeeDao employeeDao;

    private static final Logger LOGGER = LoggerFactory.getLogger(Facade.class);

    public List<Company> searchForCompanyWithAnyFragmentOfName(String fragmentOfCompanyName) {
        LOGGER.info("Start searching company using this fragment: " + fragmentOfCompanyName);
        List<Company> companies = companyDao.findCompanyByAnyFragment(fragmentOfCompanyName);
        if (companies == null) {

        }
        return companies;
    }

    public List<Employee> searchForEmployeeWithAnyFragmentOfName(String fragentOfEmployeeName) {
        LOGGER.info("Searching for employee using [" + fragentOfEmployeeName + "] letters.");
        List<Employee> employees = employeeDao.findEmployeeByAnyFragment(fragentOfEmployeeName);
        if (employees == null) {
            LOGGER.info("There is no employee with [" + fragentOfEmployeeName+ "] in its name." );
        }
        return employees;
    }

}
