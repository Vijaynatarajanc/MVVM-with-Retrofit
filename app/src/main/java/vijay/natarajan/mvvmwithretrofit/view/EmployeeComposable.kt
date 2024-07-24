package vijay.natarajan.mvvmwithretrofit.view

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Divider
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.livedata.observeAsState
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.unit.dp
import vijay.natarajan.mvvmwithretrofit.model.api.repository.Data
import vijay.natarajan.mvvmwithretrofit.viewmodel.EmployeeViewModel

@Composable
fun EmployeeComposable(viewModel: EmployeeViewModel) {

    val employees by viewModel.employees.observeAsState()

    LaunchedEffect(Unit) {
        viewModel.fetchEmployees()
    }
    Column(
        modifier = Modifier
            .wrapContentSize()
            .clip(RoundedCornerShape(4.dp))
            .padding(16.dp),
        verticalArrangement = Arrangement.Center
    ) {
        if (employees?.data.isNullOrEmpty()) {
            Text(text = "Loading...")
        } else {
            var emps = employees?.data as List<Data>

            emps.let {
                LazyColumn {
                    items(it) {
                        Text(text =it.employee_name)
                        Text(text =it.employee_age.toString())
                        Text(text =it.employee_salary.toString())

                        Divider()
                    }
                }
            }
        }
    }
}