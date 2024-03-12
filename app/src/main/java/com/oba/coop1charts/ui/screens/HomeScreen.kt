package com.oba.coop1charts.ui.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ElevatedButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.oba.coop1charts.Destination

@Composable
fun HomeScreen(navController: NavController) {
    Box(modifier = Modifier.fillMaxSize()) {
        Column(modifier = Modifier
            .fillMaxWidth()
            .align(Alignment.Center),
            horizontalAlignment = Alignment.CenterHorizontally) {

            ElevatedButton(
                onClick = { navController.navigate(Destination.BarChart.route) },
                colors = ButtonDefaults.buttonColors(containerColor = Color.Blue)
            ) {
                Text(Destination.BarChart.title.uppercase(), fontSize = 16.sp)
            }

            ElevatedButton(
                onClick = { navController.navigate(Destination.CandleStick.route) },
                colors = ButtonDefaults.buttonColors(containerColor = Color.Magenta)
            ) {
                Text(Destination.CandleStick.title.uppercase(), fontSize = 16.sp)
            }

            ElevatedButton(
                onClick = { navController.navigate(Destination.LineChart.route) },
                colors = ButtonDefaults.buttonColors(containerColor = Color.Black)
            ) {
                Text(Destination.LineChart.title.uppercase(), fontSize = 16.sp)
            }

//            ElevatedButton(
//                onClick = { navController.navigate(Destination.PieChart.route) },
//                colors = ButtonDefaults.buttonColors(containerColor = Color.Green)
//            ) {
//                Text(Destination.PieChart.title.uppercase(), fontSize = 16.sp)
//            }

            ElevatedButton(
                onClick = { navController.navigate(Destination.AreaChart.route) },
                colors = ButtonDefaults.buttonColors(containerColor = Color.Yellow,
                                contentColor = Color.Black)
            ) {
            Text(Destination.AreaChart.title.uppercase(), fontSize = 16.sp)
            }

            ElevatedButton(
                onClick = { navController.navigate(Destination.GaugeChart.route) },
                colors = ButtonDefaults.buttonColors(containerColor = Color.Red)
            ) {
            Text(Destination.GaugeChart.title.uppercase(), fontSize = 16.sp)
            }
        }
    }
}

//@Preview
//@Composable
//fun HomeScreenPreview() {
//    HomeScreen(navController = rememberNavController())
//}