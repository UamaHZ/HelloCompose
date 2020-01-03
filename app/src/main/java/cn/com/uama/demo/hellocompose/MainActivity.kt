package cn.com.uama.demo.hellocompose

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.Composable
import androidx.compose.unaryPlus
import androidx.ui.core.Text
import androidx.ui.core.dp
import androidx.ui.core.setContent
import androidx.ui.foundation.DrawImage
import androidx.ui.layout.*
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
     * 布局-调整图片的大小
     * 给图片设置宽高需要将它放在一个 `Container` 组件中，然后对 `Container` 设置大小和位置。
     *
     * Height 指定了 Container 的高度
     * Expanded 表示 Container 的大小为父组件所允许的最大宽高
     * wraps 表示使用多个修饰符（modifier），但是前面的优先级更高
     */
    @Composable
    fun NewsStory() {
        val image = +imageResource(R.drawable.header)
        Column(
                modifier = Spacing(16.dp)
        ) {
            Container(modifier = Height(180.dp) wraps Expanded) {
                DrawImage(image = image)
            }

            HeightSpacer(16.dp)

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