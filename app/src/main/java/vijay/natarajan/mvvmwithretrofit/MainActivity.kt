package vijay.natarajan.mvvmwithretrofit

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.activity.viewModels
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import vijay.natarajan.mvvmwithretrofit.ui.theme.MVVMWithRetrofitTheme
import vijay.natarajan.mvvmwithretrofit.view.EmployeeComposable
import vijay.natarajan.mvvmwithretrofit.viewmodel.EmployeeViewModel

class MainActivity : ComponentActivity() {
    private val viewModel: EmployeeViewModel by viewModels()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Surface(
                modifier = Modifier
                    .background(Color.Blue)
                    .fillMaxHeight()
            ) {
                EmployeeComposable(viewModel = viewModel)
            }
        }
    }
}

