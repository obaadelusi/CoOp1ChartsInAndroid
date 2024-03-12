package com.oba.coop1charts.ui.screens

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.himanshoe.charty.area.AreaChart
import com.himanshoe.charty.area.model.AreaData
import com.himanshoe.charty.common.ChartDataCollection
import com.himanshoe.charty.common.ComposeList
import com.himanshoe.charty.line.LineChart

@Composable
fun AreaChartScreen() {
    val areaData = listOf(
        AreaData(
            points = listOf(0.5f, 0.8f, 0.6f, 0.9f, 0.7f, 0.4f),
            xValue = "Item 1",
            color = Color.Yellow
        ),
        AreaData(
            xValue = "Item 2",
            points = listOf(0.33f, 0.6f, 0.93f, 0.7f, 0.9f, 1.5f),
            color = Color.DarkGray
        ),
        AreaData(
            xValue = "Item 3",
            points = listOf(0.3f, 0.6f, 0.4f, 0.7f, 0.9f, 0.3f),
            color = Color.Red
        ),
    )

    Box(modifier = Modifier
        .fillMaxSize()
        .padding(10.dp)
    ) {
        Column {
            Text("Area Chart", style = MaterialTheme.typography.headlineLarge)

            AreaChart(
                modifier = Modifier
                    .size(400.dp),
                areaData = ComposeList(
                    areaData
                )
            )
        }
    }

}