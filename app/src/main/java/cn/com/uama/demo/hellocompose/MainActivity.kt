package cn.com.uama.demo.hellocompose

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.Composable
import androidx.ui.core.Text
import androidx.ui.core.setContent
import androidx.ui.tooling.preview.Preview

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        /*
        下面的 setContent 块定义了当前 activity 的布局。
        和以前使用 XML 文件定义布局不同，我们现在使用可组合函数来定义。
        可组合函数就是用 @Composable 注解标记了的普通函数，在其中需要描述它所表示的组件需要如何展示在界面上。
        Text() 就是一个在 Compose UI 库中定义的可组合函数，可以通过调用该函数在界面上显示一个文本元素。
         */
        setContent {
            Greeting("Compose")
        }
    }

    /**
     * 自定义可组合函数
     * 在一个普通函数上加上 @Composable 注解，就可以使它变成可组合函数。
     * 可组合函数只能在其他可组合函数中被调用，但是可组合函数中也是可以调用普通函数的。
     */
    @Composable
    fun Greeting(name: String) {
        Text(text = "Hello $name!")
    }

    /**
     * 预览函数
     * 预览函数可以使你在 IDE 中即可预览可组合函数的效果，而无需运行到手机或模拟器上。
     * 预览函数主要的限制是不能有参数，所以就不能对 Greeting(name) 函数进行预览。
     * 因此需要再定义一个无参的 PreviewGreeting() 函数作为预览函数，在预览函数中调用 Greeting(name) 函数并传输适当的参数。
     * 由于一个可组合函数必须在另一个可组合函数中被调用，所以预览函数也必须是可组合函数。
     * 在 @Composable 注解前面再加一个 @Preview 注解即表示这是一个预览函数。
     *
     * 重新构件工程，就可以看到一个预览窗口，窗口中展示的是预览函数中描述的 UI 元素。
     * 当代码有变动是，预览窗口不会自动刷新，需要手动点击刷新按钮或者重新构件工程。
     */
    @Preview
    @Composable
    fun PreviewGreeting() {
        Greeting(name = "Compose")
    }
}