package com.example.lab06menuscompose.components

import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.FloatingActionButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun CustomFAB(count: Int, onClick: () -> Unit) {
    FloatingActionButton(
        onClick = onClick,
        shape = CircleShape, // Botón completamente redondo
        containerColor = MaterialTheme.colorScheme.primary, // Fondo
        contentColor = Color.White, // Color del texto/icono
        elevation = FloatingActionButtonDefaults.elevation(defaultElevation = 8.dp) // Sombra
    ) {
        Text(
            text = "+$count", // Muestra cuántas veces se presionó
            fontSize = 24.sp,
            color = Color.White
        )
    }
}
