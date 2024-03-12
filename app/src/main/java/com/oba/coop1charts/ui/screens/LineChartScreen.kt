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
import com.himanshoe.charty.gauge.GaugeChart
import com.himanshoe.charty.line.CurveLineChart
import com.himanshoe.charty.line.LineChart
import com.himanshoe.charty.line.model.LineData
import com.himanshoe.charty.point.PointChart

@Composable
fun LineChartScreen() {

    Box(modifier = Modifier
        .fillMaxSize()
        .padding(10.dp)
    ) {
        Column {
            Text("Line Chart", style = MaterialTheme.typography.headlineLarge)

            LineChart(
                dataCollection = ChartDataCollection(generateLineChartData()),
                modifier = Modifier.size(450.dp)
            )
        }
    }

}

private fun generateLineChartData(): List<LineData> {
    return listOf(
        LineData(0F, "Jan"),
        LineData(10F, "Feb"),
        LineData(05F, "Mar"),
        LineData(50F, "Apr"),
        LineData(55F, "May"),
        LineData(03F, "June"),
        LineData(9F, "July"),
        LineData(40F, "Aug"),
        LineData(60F, "Sept"),
        LineData(33F, "Oct"),
        LineData(11F, "Nov"),
    )
}