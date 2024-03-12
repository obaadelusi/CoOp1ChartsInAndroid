package com.oba.coop1charts

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.oba.coop1charts.ui.components.BottomNavBar
import com.oba.coop1charts.ui.screens.AboutScreen
import com.oba.coop1charts.ui.screens.AreaChartScreen
import com.oba.coop1charts.ui.screens.BarChartScreen
import com.oba.coop1charts.ui.screens.CandleStickChartScreen
import com.oba.coop1charts.ui.screens.GaugeChartScreen
import com.oba.coop1charts.ui.screens.HomeScreen
import com.oba.coop1charts.ui.screens.LineChartScreen
import com.oba.coop1charts.ui.screens.PieChartScreen
import com.oba.coop1charts.ui.theme.Coop1ChartsTheme

sealed class Destination(val route: String, val title: String) {
    data object Home: Destination("home", "Home")
    data object About: Destination("about", "About")
    data object BarChart: Destination("bar-chart", "Bar Chart")
    data object CandleStick: Destination("candle-chart", "Candle Stick Chart")
    data object AreaChart: Destination("area-chart", "Area Chart")
    data object GaugeChart: Destination("gauge-chart", "Gauge Chart")
    data object LineChart: Destination("line-chart", "Line Chart")
    data object PieChart: Destination("pie-chart", "Pie Chart")
}

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Coop1ChartsTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    val navController = rememberNavController()

                    HomeScaffold(navController)
                }
            }
        }
    }
}

@Composable
fun HomeScaffold(
    navController: NavHostController
) {
    Scaffold(
        bottomBar = {
            BottomNavBar(navController = navController)
        }
    ){ paddingValues ->

        NavHost(navController = navController,
            startDestination = Destination.Home.route,
            modifier = Modifier.padding(paddingValues))
        {
            composable(Destination.Home.route){
                 HomeScreen(navController)
            }

            composable(Destination.About.route){
                 AboutScreen()
            }

            composable(Destination.BarChart.route){
                 BarChartScreen()
            }

            composable(Destination.CandleStick.route){
                 CandleStickChartScreen()
            }

            composable(Destination.LineChart.route){
                 LineChartScreen()
            }

            composable(Destination.AreaChart.route){
                AreaChartScreen()
            }

            composable(Destination.GaugeChart.route){
                GaugeChartScreen()
            }

            composable(Destination.PieChart.route){
                 PieChartScreen()
            }
        }
    }
}