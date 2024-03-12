package com.oba.coop1charts.ui.screens

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.himanshoe.charty.common.ChartDataCollection
import com.himanshoe.charty.common.config.StartAngle
import com.himanshoe.charty.pie.PieChart
import com.himanshoe.charty.pie.config.PieChartDefaults
import com.himanshoe.charty.pie.model.PieData

@Composable
fun PieChartScreen() {
    val pieData = listOf(
        PieData(30f, "Category A", color = Color(0xFFED625D)),
        PieData(20f, "Category B", color = Color(0xFFF79F88)),
        PieData(13f, "Category C", color = Color(0xFF43A047)),
        PieData(10f, "Category D", color = Color(0xFF93A047)),
    )

    Box(modifier = Modifier.fillMaxSize().padding(10.dp)) {
        Column() {
            Text("Pie Chart", style = MaterialTheme.typography.headlineLarge)

            PieChart(
                //pieChartConfig = PieChartDefaults.defaultConfig()
                    //.copy(donut = false, showLabel = true, startAngle = StartAngle.StraightAngle),
                dataCollection = ChartDataCollection(pieData),
                modifier = Modifier.wrapContentSize()
            )
        }
    }
}
