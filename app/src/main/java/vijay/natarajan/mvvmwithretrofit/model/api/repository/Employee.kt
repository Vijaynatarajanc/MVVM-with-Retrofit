package vijay.natarajan.mvvmwithretrofit.model.api.repository

import androidx.core.app.NotificationCompat.MessagingStyle.Message

data class Employee(
    val data:List<Data>,
    val message: String,
    val status: String
)