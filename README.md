# ZzHorizontalProgressBar

A highly customized horizontal progress bar control.

## Source

Inspired by [zhouzhuo810/ZzHorizontalProgressBar](https://github.com/zhouzhuo810/ZzHorizontalProgressBar)  version v1.1.1 

## Features

1. Support custom progress color;
2. Support custom background color;
3. Support the user-defined background and progress of the internal spacing size;
4. Support custom maximum and default progress value;
5. Support for gradient color progress;
6. Support for the second-level progress bar.


![progressbar_gif](https://github.com/vidyaakbar/ZzHorizontalProgressBar/blob/main/screenshots/zzhorizontalprogressbar.gif)


## Dependency

1.For using ZzHorizontalProgressBar module in sample app, include the source code and add the below dependencies in entry/build.gradle to generate hap/support.har.


```
    
dependencies {
    implementation fileTree(dir: 'libs', include: ['*.jar', '*.har'])
    testImplementation 'junit:junit:4.13'
    ohosTestImplementation 'com.huawei.ohos.testkit:runner:1.0.0.100'
    implementation project(':zzhorizontalprogressbar')
}
```

2.For using ZzHorizontalProgressBar in separate application using har file, add the har file in the entry/libs folder and add the dependencies in entry/build.gradle file.
```
dependencies {
    implementation fileTree(dir: 'libs', include: ['*.jar'])
    testImplementation 'junit:junit:4.13'
}
```




<h3>Usage</h3>

1.xml

```
       <me.zhouzhuo.zzhorizontalprogressbar.ZzHorizontalProgressBar
              ohos:id="$+id:pb4"
              ohos:height="40vp"
              ohos:width="match_parent"
              ohos:left_margin="20vp"
              ohos:top_margin="20vp"
              ohos:right_margin="20vp"
              custom:zpb_bg_color="#dbdbdb"
              custom:zpb_gradient_from="#419120"
              custom:zpb_gradient_to="#b3eb50"
              custom:zpb_max="100"
              custom:zpb_open_gradient="true"
              custom:zpb_padding="1vp"
              custom:zpb_show_mode="rect"
              />

```

2.java


```java
        final ZzHorizontalProgressBar pb4 = (ZzHorizontalProgressBar) findComponentById(ResourceTable.Id_pb4);

		//set progress value
        pb4.setProgress(progress);

		//set background color
        pb4.setBgColor(Color.RED);

		//set progress color
        pb4.setProgressColor(Color.BLUE);

		//set max value
        pb4.setMax(100);		
```

</br>

<h3>Property description:
</h3>

|Properties|Action|Type|
| --- | ---|---|
|zpb_padding|The size of the inner space between the background and progress|dimension|
|zpb_second_pb_color |Secondary progress background color|color|
|zpb_bg_color |Background Color|color|
|zpb_pb_color |progress color|color|
|zpb_max |Progress Maximum|int|
|zpb_progress |Default progress value|int|
|zpb_second_progress |Secondary progress default progress value|int|
|zpb_open_gradient|Whether to use gradient colors|boolean|
|zpb_gradient_from|Start Gradient Color|color|
|zpb_gradient_to|End gradient color|color|
|zpb_show_second_progress|Is the secondary progress shown|boolean|
|zpb_open_second_gradient|Whether secondary progress uses gradient colors|boolean|
|zpb_second_gradient_from|Secondary Progress Start Gradient Color|color|
|zpb_second_gradient_to|Secondary Progress End Gradient Color|color|
|zpb_show_second_point_shape|secondary progress shape（point,line）|int|
|zpb_show_mode|Mode to Display Progress (round,rect,round_rect)|int|
|zpb_round_rect_radius|round_rect Radius of the filet in mode|dimension|
|zpb_draw_border|Do I draw a border|boolean|
|zpb_border_width|The line width of the border|dimension|
|zpb_border_color|Color of the border|color|



### License

```
Copyright © zhouzhuo810

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
