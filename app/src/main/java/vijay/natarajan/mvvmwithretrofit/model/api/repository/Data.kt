package vijay.natarajan.mvvmwithretrofit.model.api.repository

import com.google.gson.annotations.SerializedName

data class Data(
    val employee_age: Int,
    val employee_name: String,
    val employee_salary: Int,
    val id: Int,
    val profile_image: String,
)