package uz.isds.meterai.ui

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.defaultMinSize
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import uz.isds.meterai.R
import uz.isds.meterai.ui.component.TextApp
import uz.isds.meterai.ui.theme.backgroundColor
import uz.isds.meterai.ui.theme.primaryColor
import uz.isds.meterai.ui.theme.textColor

@Composable
fun ResultScreen() {
    ResultContent()
}

@Composable
private fun ResultContent() {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(backgroundColor)
    ) {
        Column {
            Row(
                verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier.padding(bottom = 20.dp)
            ) {
                IconButton(
                    onClick = {},
                    modifier = Modifier.padding(vertical = 8.dp, horizontal = 4.dp)
                ) {
                    Icon(painter = painterResource(R.drawable.ic_back), contentDescription = null)
                }

                TextApp(text = "Результат", fontWeight = FontWeight(700), fontSize = 22.sp)
            }

            Row(
                verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier
                    .padding(horizontal = 16.dp)
                    .padding(bottom = 40.dp)
            ) {
                Icon(
                    painter = painterResource(R.drawable.info_circle),
                    tint = Color(0xFF47404F),
                    contentDescription = null,
                    modifier = Modifier.padding(end = 10.dp)
                )
                TextApp(
                    "Проверьте данные. Если они верны, подтвердите. В случае ошибки переснимите или отредактируйте",
                    lineHeight = 19.5.sp
                )
            }

            TextApp(
                text = "Фрагмент для обработки",
                Modifier.padding(start = 16.dp, bottom = 6.dp),
                color = Color(0xFF7F7A84),
                fontSize = 12.sp
            )
            // imagega almashtir
            Box(
                modifier = Modifier
                    .padding(horizontal = 16.dp)
                    .fillMaxWidth()
                    .height(50.dp)
                    .background(Color(0xFFF3F3F3))
            )

            TextApp(
                fontSize = 12.sp,
                text = "Результат распознавания",
                modifier = Modifier.padding(start = 16.dp, bottom = 6.dp, top = 20.dp),
                color = Color(0xFF7F7A84)
            )
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 16.dp)
                    .defaultMinSize(minHeight = 50.dp)
                    .background(Color(0xFFF3F3F3), RoundedCornerShape(10.dp))
                    .padding(vertical = 7.dp),
                horizontalArrangement = Arrangement.Center,
                verticalAlignment = Alignment.CenterVertically
            ) {
                repeat(5) {
                    Box(
                        modifier = Modifier
                            .padding(end = 2.dp)
                            .defaultMinSize(minWidth = 26.dp, minHeight = 36.dp)
                            .background(
                                backgroundColor,
                                RoundedCornerShape(7.25.dp)
                            ), contentAlignment = Alignment.Center
                    ) {
                        TextApp((it + 1).toString(), fontWeight = FontWeight(700), fontSize = 13.sp)
                    }
                }
                TextApp(
                    ",", modifier = Modifier
                        .align(Alignment.Bottom)
                        .padding(end = 2.dp)
                )
                repeat(3) {
                    Box(
                        modifier = Modifier
                            .padding(end = 2.dp)
                            .defaultMinSize(minWidth = 26.dp, minHeight = 36.dp)
                            .background(
                                backgroundColor,
                                RoundedCornerShape(7.25.dp)
                            ), contentAlignment = Alignment.Center
                    ) {
                        TextApp(
                            "1",
                            fontWeight = FontWeight(700),
                            fontSize = 13.sp,
                            color = primaryColor
                        )
                    }
                }

                TextApp(
                    text = "м3", modifier = Modifier
                        .align(Alignment.Bottom), fontSize = 13.sp
                )
            }
        }
        Row(
            modifier = Modifier
                .align(Alignment.BottomCenter)
                .padding(bottom = 20.dp),
            horizontalArrangement = Arrangement.spacedBy(30.dp)
        ) {
            Column(horizontalAlignment = Alignment.CenterHorizontally) {
                Box(modifier = Modifier
                    .size(60.dp)
                    .clip(CircleShape)
                    .background(Color(0xFFE4E3E5))
                    .clickable { }, contentAlignment = Alignment.Center
                ) {

                    Icon(
                        painter = painterResource(R.drawable.ic_refresh),
                        contentDescription = null,
                        tint = textColor
                    )
                }

                TextApp(text = "Переснять")
            }


            Column(horizontalAlignment = Alignment.CenterHorizontally) {
                Box(modifier = Modifier
                    .size(60.dp)
                    .clip(CircleShape)
                    .background(primaryColor)
                    .clickable { }, contentAlignment = Alignment.Center
                ) {

                    Icon(
                        painter = painterResource(R.drawable.ic_checked),
                        contentDescription = null,
                        tint = Color.White
                    )
                }
                TextApp(text = "Подтвердить")
            }
        }
    }
}

@Preview
@Composable
private fun ResultPreview() {
    ResultContent()
}