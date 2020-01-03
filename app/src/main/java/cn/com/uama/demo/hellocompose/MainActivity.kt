package cn.com.uama.demo.hellocompose

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.Composable
import androidx.compose.unaryPlus
import androidx.ui.core.Clip
import androidx.ui.core.Text
import androidx.ui.core.dp
import androidx.ui.core.setContent
import androidx.ui.foundation.DrawImage
import androidx.ui.foundation.shape.corner.RoundedCornerShape
import androidx.ui.layout.*
import androidx.ui.material.MaterialTheme
import androidx.ui.res.imageResource
import androidx.ui.tooling.preview.Preview

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            NewsStory()
        }
    }

    /**
     * Material Design
     * 给文本元素设置样式
     * 在 Column 外面包裹 MaterialTheme 组件，给文本元素指定样式
     */
    @Composable
    fun NewsStory() {
        val image = +imageResource(R.drawable.header)
        MaterialTheme {
            val typography = +MaterialTheme.typography()
            Column(
                    modifier = Spacing(16.dp)
            ) {
                Container(modifier = Height(180.dp) wraps Expanded) {
                    Clip(shape = RoundedCornerShape(8.dp)) {
                        DrawImage(image = image)
                    }
                }

                HeightSpacer(16.dp)

                Text(
                        "A day in Shark Fin Cove",
                        style = typography.h6
                )
                Text(
                        "Davenport, California",
                        style = typography.body2
                )
                Text(
                        "December 2018",
                        style = typography.body2
                )
            }
        }
    }

    /**
     * 预览函数
     * 虽然 NewsStory() 本身就没有参数，但是最好的做法还是创建单独的预览函数，
     * 单独的预览函数不会被应用本身调用，这样可以提升性能，并且后面还可以创建多个预览函数。
     */
    @Preview
    @Composable
    fun DefaultPreview() {
        NewsStory()
    }
}