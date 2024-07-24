package vijay.natarajan.mvvmwithretrofit.model.api.repository

import vijay.natarajan.mvvmwithretrofit.model.api.RetrofitInstance

class ApiRepository {

    private val employeeService = RetrofitInstance.getEmployeeService

    suspend fun getEmployee():Employee{
        return employeeService.getEmployees()
    }
}