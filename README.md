# DesignSupportDemo
材料设计支持库Design Support Library的使用

## 1. 简介 ##
Design Support Library是Google在2015年的IO大会上发布的全新Material Design支持库，在这个support库里面主要包含了 8 个新的 Material Design组件，最低支持 Android 2.1。

Widget Name	| Description
------ | ------
TextInputLayout	| EditText辅助控件
FloatingActionButton | MD风格的圆形按钮
Snackbar| 提示框 
TabLayout | 选项卡 
NavigationView | DrawerLayout的侧滑界面 
CoordinatorLayout | 超级FrameLayout 
AppBarLayout | MD风格的滑动Layout
CollapsingToolbarLayout | 可折叠的MD风格ToolbarLayout

## 2. 使用方法 ##
在build.gradle文件中加上这段代码：

```
compile 'com.android.support:design:22.2.0'
```

[官方博客](http://android-developers.blogspot.jp/2015/05/android-design-support-library.html)

[Snackbar提示框](http://blog.csdn.net/kong_gu_you_lan/article/details/51944248)

[TabLayout选项卡](http://blog.csdn.net/kong_gu_you_lan/article/details/51954327)

[EditText辅助控件——TextInputLayout](http://blog.csdn.net/kong_gu_you_lan/article/details/52057050)

[FrameLayout布局的增强版—CoordinatorLayout](http://blog.csdn.net/kong_gu_you_lan/article/details/51956496)

[可折叠的Toolbar——CollapsingToolbarLayout](http://blog.csdn.net/kong_gu_you_lan/article/details/51958313)

## License

```
Copyright (C) 2017 YangLe

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

   http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
```