package cn.com.uama.demo.hellocompose

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.ui.core.Text
import androidx.ui.core.setContent

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
            Text(text = "Hello, Compose!")
        }
    }
}