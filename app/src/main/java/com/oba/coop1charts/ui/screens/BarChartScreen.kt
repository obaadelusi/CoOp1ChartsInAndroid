package com.oba.coop1charts.ui.screens

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.himanshoe.charty.bar.BarChart
import com.himanshoe.charty.bar.model.BarData
import com.himanshoe.charty.candle.CandleStickChart
import com.himanshoe.charty.candle.model.CandleData
import com.himanshoe.charty.circle.CircleChart
import com.himanshoe.charty.circle.model.CircleData
import com.himanshoe.charty.common.ChartDataCollection
import com.himanshoe.charty.common.ComposeList
import com.himanshoe.charty.line.LineChart

@Composable
fun BarChartScreen() {
    val bardata = listOf(
        BarData(10f, "A", color = Color(0xFFED625D)),
        BarData(20f, "B", color = Color(0xFFED125D)),
        BarData(50f, "C", color = Color(0xFFED225D)),
        BarData(40f, "D", color = Color(0xFFED325D)),
        BarData(23f, "E", color = Color(0xFFED425D)),
        BarData(35F, "F", color = Color(0xFFED525D)),
        BarData(20f, "K", color = Color(0xFFED615D)),
        BarData(50f, "L", color = Color(0xFFED625D)),
    )

    Box(modifier = Modifier
        .fillMaxSize()
        .padding(10.dp)
    ) {
        Column {
            Text("Bar Chart", style = MaterialTheme.typography.headlineLarge)

            BarChart(
                dataCollection = ChartDataCollection(bardata),
                modifier = Modifier
                    .fillMaxWidth()
                    .height(400.dp),
                barColor = Color.DarkGray
            )
        }
    }
}
