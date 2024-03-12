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
fun CandleStickChartScreen() {

    val candleData = listOf(
        CandleData(high = 20f, low = 8f, open = 10f, close = 15f),
        CandleData(high = 22f, low = 16f, open = 18f, close = 20f),
        CandleData(high = 14f, low = 8f, open = 12f, close = 9f),
        CandleData(high = 9f, low = 3f, open = 7f, close = 5f),
        CandleData(high = 10f, low = 4f, open = 6f, close = 8f),
        CandleData(high = 15f, low = 10f, open = 13f, close = 12f),
        CandleData(high = 20f, low = 8f, open = 10f, close = 15f),
        CandleData(high = 22f, low = 16f, open = 18f, close = 20f),
        CandleData(high = 14f, low = 8f, open = 12f, close = 9f),
        CandleData(high = 9f, low = 3f, open = 7f, close = 5f),
        CandleData(high = 10f, low = 4f, open = 6f, close = 8f),
        CandleData(high = 15f, low = 10f, open = 13f, close = 12f),
        CandleData(high = 9f, low = 3f, open = 7f, close = 5f),
        CandleData(high = 10f, low = 4f, open = 6f, close = 8f),
        CandleData(high = 15f, low = 10f, open = 13f, close = 12f),
        CandleData(high = 20f, low = 8f, open = 10f, close = 15f),
        CandleData(high = 22f, low = 16f, open = 18f, close = 20f),
        CandleData(high = 14f, low = 8f, open = 12f, close = 9f),
        CandleData(high = 9f, low = 3f, open = 7f, close = 5f),
        CandleData(high = 10f, low = 4f, open = 6f, close = 8f),
        CandleData(high = 15f, low = 10f, open = 13f, close = 12f),
    )

    Box(modifier = Modifier
        .fillMaxSize()
        .padding(10.dp)
    ) {
        Column {
            Text("Candle Stick Chart", style = MaterialTheme.typography.headlineLarge)

            CandleStickChart(
                candleData = ComposeList(candleData),
                modifier = Modifier
                    .fillMaxWidth()
                    .height(400.dp),
            )
        }
    }
}
