package com.filkom.lazylayout

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Card
import androidx.compose.material3.CardElevation
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.filkom.lazylayout.ui.theme.LazyLayoutTheme

class MainActivity : ComponentActivity() {
    val gadgets = listOf(
        Gadget(1, "Smartphone", "Perangkat komunikasi genggam"),
        Gadget(2, "Laptop", "Komputer portabel untuk bekerja"),
        Gadget(3, "Tablet", "Perangkat layar sentuh antara hp dan laptop"),
        Gadget(4, "Smartwatch", "Jam tangan pintar pelacak kesehatan"),
        Gadget(5, "Earbuds", "Perangkat audio nirkabel"),
        Gadget(6, "Laptop", "Perangkat komputasi portabel"),
        Gadget(7, "Smartphone", "Perangkat komunikasi genggam"),
        Gadget(8, "Laptop", "Komputer portabel untuk bekerja"),
        Gadget(9, "Tablet", "Perangkat layar sentuh antara hp dan laptop"),
        Gadget(10, "Smartwatch", "Jam tangan pintar pelacak kesehatan"),
        Gadget(11, "Earbuds", "Perangkat audio nirkabel"),
        Gadget(12, "Laptop", "Perangkat komputasi portabel"),
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            LazyLayoutTheme {
                GadgetGrid(gadgets)
            }
        }
    }
}

@Composable
fun GadgetItem(gadget: Gadget) {
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .padding(8.dp)
    ) {
        Column(modifier = Modifier.padding(16.dp)) {
            Text(text = gadget.name, style = MaterialTheme.typography.headlineMedium)
            Text(text = gadget.description, style = MaterialTheme.typography.bodyLarge)
        }
    }
}

// 2. Komponen List Vertikal
@Composable
fun GadgetList(gadgets: List<Gadget>) {
    LazyColumn (
        contentPadding = PaddingValues(bottom = 16.dp),
        modifier = Modifier.fillMaxSize()
    ) {
        items(gadgets) { gadget ->
            GadgetItem(gadget)
        }
    }
}

@Composable
fun GadgetGrid(gadgets: List<Gadget>) {
    LazyVerticalGrid(
        //columns = GridCells.Fixed(2),
        columns = GridCells.Adaptive(minSize = 150.dp),
        contentPadding = PaddingValues(8.dp),
        modifier = Modifier.fillMaxSize()
    ) {
        items(gadgets) { gadget ->
            GadgetItem(gadget)
        }
    }
}