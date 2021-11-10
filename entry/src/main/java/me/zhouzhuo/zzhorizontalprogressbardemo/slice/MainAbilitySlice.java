/*
 * Copyright (C) 2020-21 Application Library Engineering Group
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package me.zhouzhuo.zzhorizontalprogressbardemo.slice;

import ohos.aafwk.ability.AbilitySlice;
import ohos.aafwk.content.Intent;
import ohos.agp.components.Slider;
import ohos.agp.components.Text;
import me.zhouzhuo.zzhoritontalprogressbar.ZzHorizontalProgressBar;
import me.zhouzhuo.zzhorizontalprogressbardemo.ResourceTable;

/**
 * MainAbilitySlice.
 */
public class MainAbilitySlice extends AbilitySlice {
    @Override
    public void onStart(Intent intent) {

        super.onStart(intent);
        super.setUIContent(ResourceTable.Layout_ability_main);



        final ZzHorizontalProgressBar pb = (ZzHorizontalProgressBar) findComponentById(ResourceTable.Id_pb);
        final ZzHorizontalProgressBar pb1 = (ZzHorizontalProgressBar) findComponentById(ResourceTable.Id_pb1);
        final ZzHorizontalProgressBar pb2 = (ZzHorizontalProgressBar) findComponentById(ResourceTable.Id_pb2);
        final ZzHorizontalProgressBar pb3 = (ZzHorizontalProgressBar) findComponentById(ResourceTable.Id_pb3);
        final ZzHorizontalProgressBar pb4 = (ZzHorizontalProgressBar) findComponentById(ResourceTable.Id_pb4);
        final ZzHorizontalProgressBar pb5 = (ZzHorizontalProgressBar) findComponentById(ResourceTable.Id_pb5);
        final ZzHorizontalProgressBar pb6 = (ZzHorizontalProgressBar) findComponentById(ResourceTable.Id_pb6);



        final Text tvProgress = (Text) findComponentById(ResourceTable.Id_tv_progress);



        Slider seekBar = (Slider) findComponentById(ResourceTable.Id_seekbar);

        seekBar.setValueChangedListener(new Slider.ValueChangedListener() {

            @Override
            public void onProgressUpdated(Slider slider, int progress, boolean b) {
                try {

                    pb.setProgress(progress);
                    pb1.setProgress(progress);
                    pb1.setSecondProgress(progress - 20);
                    pb2.setProgress(progress);
                    pb2.setSecondProgress(progress - 30);
                    pb3.setProgress(progress);
                    pb4.setProgress(progress);
                    pb5.setProgress(progress);
                    pb6.setProgress(progress);
                    if (progress > 80) {
                        pb3.setProgressColor(0xff00ff00);
                        pb5.setGradientColorAndBorderColor(0x7ff5515f, 0x7f9f041b, 0xffff001f);
                    } else {
                        pb3.setProgressColor(0xffff0000);
                        pb5.setGradientColorAndBorderColor(0x7fb4ec51, 0x7f429321, 0xff85ff00);
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }

            @Override
            public void onTouchStart(Slider slider) {
                //this method is empty

            }

            @Override
            public void onTouchEnd(Slider slider) {
                //this method is empty
            }
        });


        try {
            pb4.setOnProgressChangedListener(new ZzHorizontalProgressBar.OnProgressChangedListener() {

                @Override
                public void onProgressChanged(ZzHorizontalProgressBar progressBar, int max, int progress) {

                    tvProgress.setText("Progress = " + progress + ", max = " + max);

                }

                @Override
                public void onSecondProgressChanged(ZzHorizontalProgressBar progressBar, int max, int progress) {
                    //this method is empty

                }
            });
        } catch (Exception e) {
            e.printStackTrace();
        }



    }


    @Override
    public void onActive() {
        super.onActive();
    }

    @Override
    public void onForeground(Intent intent) {

        super.onForeground(intent);
    }
}
