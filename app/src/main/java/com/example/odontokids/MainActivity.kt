package com.example.odontokids

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.odontokids.ui.theme.OdontokidsTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            OdontokidsTheme {
                TelaInicial()
            }
        }
    }
}

@Composable
fun TelaInicial() {
    Surface(
        modifier = Modifier.fillMaxSize(),
        color = Color(0xFF418CFC) // Azul claro
    ) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(horizontal = 16.dp),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {
            // Linha contendo imagem e texto
            Row(
                modifier = Modifier.fillMaxWidth(),
                verticalAlignment = Alignment.CenterVertically, // Alinha verticalmente no centro
                horizontalArrangement = Arrangement.Center // Alinha horizontalmente no centro
            ) {
                // Texto
                Text(
                    text = "Odonto Kids",
                    fontSize = 32.sp,
                    fontWeight = FontWeight.Bold,
                    color = Color.White,
                    textAlign = TextAlign.Center
                )

                Spacer(modifier = Modifier.width(10.dp))

                // Imagem
                Image(
                    painter = painterResource(id = R.drawable.logo), // Substitua 'logo' pelo nome do arquivo da sua imagem
                    contentDescription = "Logo",
                    modifier = Modifier
                        .size(40.dp) // Tamanho da imagem (ajuste conforme necessário)
                        .padding(end = 8.dp) // Espaço entre a imagem e o texto
                        .padding()
                )
            }


            // Subtítulo
            Text(
                text = "O sorriso do seu filho começa aqui!",
                fontSize = 16.sp,
                color = Color.White,
                textAlign = TextAlign.Center,
                modifier = Modifier.padding(top = 8.dp)
            )

            Spacer(modifier = Modifier.height(200.dp))

            // Botões
            Button(
                onClick = { /* Ação para entrar */ },
                shape = RoundedCornerShape(20.dp),  // Aumentei o valor para arredondar mais as bordas
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 32.dp),
                colors = ButtonDefaults.buttonColors(
                    containerColor = Color.White  // Define o fundo branco
                )
            ) {
                Text(
                    text = "Entrar",
                    fontSize = 16.sp,
                    color = Color(0xFF418CFC)  // Texto na cor branca
                )
            }


            Spacer(modifier = Modifier.height(16.dp))

            // Botões
            Button(
                onClick = { /* Ação para criar uma conta */ },
                shape = RoundedCornerShape(20.dp), // A borda do botão será arredondada
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 32.dp)
                    .border(2.dp, Color.White, RoundedCornerShape(20.dp)), // Borda de 2dp e cor azul
                colors = ButtonDefaults.buttonColors(
                    containerColor = Color(0xFF418CFC) // Cor do fundo azul
                )
            ) {
                Text(
                    text = "Criar uma conta",
                    fontSize = 16.sp,
                    color = Color.White // Cor do texto branca
                )
            }

        }
    }
}
