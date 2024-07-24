package vijay.natarajan.mvvmwithretrofit.viewmodel

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.launch
import vijay.natarajan.mvvmwithretrofit.model.api.repository.ApiRepository
import vijay.natarajan.mvvmwithretrofit.model.api.repository.Employee

class EmployeeViewModel:ViewModel() {

    private val repository = ApiRepository()

    private val _employees = MutableLiveData<Employee>()
    val employees:LiveData<Employee> = _employees

    fun fetchEmployees() {
        viewModelScope.launch {
            try {
                val empl = repository.getEmployee()
                _employees.value = empl

            } catch (e:Exception) {
                Log.d("Repo","fetch employee exception ${e.message}")
            }
        }
    }
}