package vijay.natarajan.mvvmwithretrofit.model.api

import retrofit2.http.GET
import vijay.natarajan.mvvmwithretrofit.model.api.repository.Employee

interface GetEmployeeService {
    @GET("employees")
    suspend fun getEmployees():Employee
}