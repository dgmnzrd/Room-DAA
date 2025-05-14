package com.example.room.viewModels

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import com.example.room.state.CronoState
import kotlinx.coroutines.Job

class CronometroViewModel : ViewModel() {
    var state by mutableStateOf(CronoState())
        private set

    var cronoState by mutableStateOf<Job?>(value = null)
        private set

    var tiempo by mutableStateOf(0L)
}