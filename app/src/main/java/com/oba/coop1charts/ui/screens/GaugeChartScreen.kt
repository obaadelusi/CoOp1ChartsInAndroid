package com.oba.coop1charts.ui.screens

import androidx.compose.animation.core.AnimationSpec
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.himanshoe.charty.gauge.GaugeChart

@Composable
fun GaugeChartScreen() {
    val percentValue = 75

    Box(modifier = Modifier.fillMaxSize().padding(10.dp)) {
        Column() {
            Text("Gauge Chart", style = MaterialTheme.typography.headlineLarge)

            GaugeChart(percentValue = percentValue,
                modifier = Modifier.size(380.dp))
        }
    }
}
