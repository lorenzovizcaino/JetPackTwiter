package com.antonio.jetpacktwiter

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box

import androidx.compose.foundation.layout.Column

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Divider
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Alignment.Companion.CenterVertically
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.InspectableModifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun Twiter() {
    var contador1 by rememberSaveable { mutableStateOf(1) }
    var contador2 by rememberSaveable { mutableStateOf(1) }
    var contador3 by rememberSaveable { mutableStateOf(1) }
    var boolean1 by rememberSaveable { mutableStateOf(true) }
    var boolean2 by rememberSaveable { mutableStateOf(true) }
    var boolean3 by rememberSaveable { mutableStateOf(true) }


    Row(modifier = Modifier.padding(10.dp)) {
        Image(
            painter = painterResource(id = R.drawable.profile),
            contentDescription = "Icono Aris",
            modifier = Modifier
                .size(70.dp)
                .clip(shape = CircleShape),
        )
        Column(modifier = Modifier.padding(start = 10.dp)) {
            Row(modifier = Modifier.fillMaxWidth()) {
                Text(
                    text = "Aris",
                    color = Color.White,
                    fontWeight = FontWeight.Bold,
                    fontSize = 18.sp
                )
                Spacer(modifier = Modifier.size(10.dp))
                Text(text = "@AristiDevs 4h", color = Color.Gray, fontSize = 18.sp)
                Spacer(modifier = Modifier.weight(1f))
                Icon(
                    painter = painterResource(id = R.drawable.ic_dots),
                    contentDescription = "dots",
                    tint = Color.White,

                    )
            }
            Spacer(modifier = Modifier.size(5.dp))
            Text(text = "Descripcion Id w arga sobre dwd", color = Color.White, fontSize = 16.sp)
            Text(
                text = "texto Descripcion larga sobre texto",
                color = Color.White,
                fontSize = 16.sp
            )
            Text(text = "Descripcion larga sobre texto", color = Color.White, fontSize = 16.sp)
            Text(text = "Descripcion larga sobre texto", color = Color.White, fontSize = 16.sp)
            Text(
                text = "Descripcion larga dw dadsobre texto",
                color = Color.White,
                fontSize = 16.sp
            )
            Spacer(modifier = Modifier.size(10.dp))
            Image(
                painter = painterResource(id = R.drawable.profile),
                contentDescription = "imagen Aris",
                modifier = Modifier
                    .fillMaxWidth()
                    .height(200.dp)
                    .clip(RoundedCornerShape(20.dp)),
                contentScale = ContentScale.Crop  //me faltaba esto

            )
            Spacer(modifier = Modifier.size(10.dp))
            Row {

                if (boolean1) {
                    Icon(painter = painterResource(id = R.drawable.ic_chat),
                        contentDescription = "chat",
                        tint = Color.Gray,
                        modifier = Modifier
                            .clickable {
                                boolean1 = !boolean1
                                contador1++
                            }
                            .weight(0.5f)

                    )

                    Text(text = "$contador1", color = Color.Gray, modifier = Modifier.weight(1f))

                } else {
                    Icon(painter = painterResource(id = R.drawable.ic_chat_filled),
                        contentDescription = "chat",
                        tint = Color.Gray,
                        modifier = Modifier
                            .clickable {
                                boolean1 = !boolean1
                                contador1--
                            }
                            .weight(0.5f)

                    )

                    Text(text = "$contador1", color = Color.Gray, modifier = Modifier.weight(1f))


                }

                if (boolean2) {
                    Icon(painter = painterResource(id = R.drawable.ic_rt),
                        contentDescription = "rt",
                        tint = Color.Gray,
                        modifier = Modifier
                            .clickable {
                                boolean2 = !boolean2
                                contador2++;
                            }
                            .weight(0.5f)

                    )

                    Text(text = "$contador2", color = Color.Gray, modifier = Modifier.weight(1f))

                } else {
                    Icon(painter = painterResource(id = R.drawable.ic_rt),
                        contentDescription = "rt",
                        tint = Color.Green,
                        modifier = Modifier
                            .clickable {
                                boolean2 = !boolean2
                                contador2--;
                            }
                            .weight(0.5f)

                    )

                    Text(text = "$contador2", color = Color.Gray, modifier = Modifier.weight(1f))


                }


                if (boolean3) {
                    Icon(painter = painterResource(id = R.drawable.ic_like),
                        contentDescription = "like",
                        tint = Color.Red,
                        modifier = Modifier
                            .clickable {
                                boolean3 = !boolean3
                                contador3++
                            }
                            .weight(0.5f)

                    )

                    Text(text = "$contador3", color = Color.Gray, modifier = Modifier.weight(1f))
                } else {
                    Icon(painter = painterResource(id = R.drawable.ic_like_filled),
                        contentDescription = "like",
                        tint = Color.Red,
                        modifier = Modifier
                            .clickable {
                                boolean3 = !boolean3
                                contador3--
                            }
                            .weight(0.5f)

                    )

                    Text(text = "$contador3", color = Color.Gray, modifier = Modifier.weight(1f))

                }


            }
        }

    }


}

@Composable
fun TuitDivider() {
    Divider(
        modifier = Modifier
            .padding(top = 4.dp)
            .height(1.dp)
            .fillMaxWidth(),
        color = Color(0xFF7E8B98)
    )
}
