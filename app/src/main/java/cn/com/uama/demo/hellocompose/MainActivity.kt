package cn.com.uama.demo.hellocompose

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.Composable
import androidx.compose.unaryPlus
import androidx.ui.core.Text
import androidx.ui.core.dp
import androidx.ui.core.setContent
import androidx.ui.foundation.DrawImage
import androidx.ui.layout.Column
import androidx.ui.layout.Spacing
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
     * 布局-增加图片
     */
    @Composable
    fun NewsStory() {
        val image = +imageResource(R.drawable.header)
        Column(
                modifier = Spacing(16.dp)
        ) {
            DrawImage(image = image)

            Text("A day in Shark Fin Cove")
            Text("Davenport, California")
            Text("December 2018")
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