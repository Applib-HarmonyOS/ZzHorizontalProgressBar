package me.zhouzhuo.zzhorizontalprogressbardemo;

import me.zhouzhuo.zzhoritontalprogressbar.ZzHorizontalProgressBar;
import ohos.aafwk.ability.delegation.AbilityDelegatorRegistry;
import ohos.agp.components.Attr;
import ohos.agp.components.AttrSet;
import ohos.app.Context;
import org.junit.Test;
import org.junit.Before;

import java.util.Optional;

import static org.junit.Assert.*;

public class ExampleOhosTest {
    private Context context;
    private AttrSet attrSet;
    private ZzHorizontalProgressBar progressBar;
    @Before
    public void setUp()  {

        context = AbilityDelegatorRegistry.getAbilityDelegator().getAppContext();
        attrSet = new AttrSet() {
            @Override
            public Optional<String> getStyle() {
                return Optional.empty();
            }

            @Override
            public int getLength() {
                return 0;
            }

            @Override
            public Optional<Attr> getAttr(int i) {
                return Optional.empty();
            }

            @Override
            public Optional<Attr> getAttr(String s) {
                return Optional.empty();
            }
        };
    }
    @Test
    public void testBundleName() {
        final String actualBundleName = AbilityDelegatorRegistry.getArguments().getTestBundleName();
        assertEquals("me.zhouzhuo.zzhorizontalprogressbardemo", actualBundleName);
    }

    @Test
    public void testMax() {
        progressBar = new ZzHorizontalProgressBar(context,attrSet);
        progressBar.setMax(100);
        assertEquals(100,progressBar.getMax());
    }

    @Test
    public void testProgress() {
      progressBar = new ZzHorizontalProgressBar(context,attrSet);
      progressBar.setProgress(10);
      assertEquals(10,progressBar.getProgress());
    }

    @Test
    public void testShowSecondProgress() {
      progressBar = new ZzHorizontalProgressBar(context,attrSet);
      progressBar.setShowSecondProgress(true);
      assertEquals(true,progressBar.isShowSecondProgress());
    }

    @Test
    public void testSecondProgress() {
        progressBar = new ZzHorizontalProgressBar(context,attrSet);
        progressBar.setSecondProgress(15);
        assertEquals(15,progressBar.getSecondProgress());
    }

    @Test
    public void testSecondProgressShape() {
        progressBar = new ZzHorizontalProgressBar(context,attrSet);
        progressBar.setSecondProgressShape(0);
        assertEquals(0,progressBar.getSecondProgressShape());
    }

    @Test
    public void testBgColor() {
        progressBar = new ZzHorizontalProgressBar(context,attrSet);
        progressBar.setBgColor(0xff3F51B5);
        assertEquals(0xff3F51B5,progressBar.getBgColor());
    }

    @Test
    public void testOpenSecondGradient() {
        progressBar = new ZzHorizontalProgressBar(context,attrSet);
        progressBar.setOpenSecondGradient(true);
        assertEquals(true,progressBar.isOpenSecondGradient());
    }

    @Test
    public void testSecondProgressColor() {
        progressBar = new ZzHorizontalProgressBar(context,attrSet);
        progressBar.setSecondProgressColor(0xffFF4081);
        assertEquals(0xffFF4081,progressBar.getSecondProgressColor());
    }

    @Test
    public void testProgressColor() {
        progressBar = new ZzHorizontalProgressBar(context,attrSet);
        progressBar.setProgressColor(0xffFF4081);
        assertEquals(0xffFF4081,progressBar.getProgressColor());
    }

    @Test
    public void testPadding() {
        progressBar = new ZzHorizontalProgressBar(context,attrSet);
        progressBar.setPadding(0);
        assertEquals(0,progressBar.getProgressBarPadding());
    }

    @Test
    public void testOpenGradient() {
        progressBar = new ZzHorizontalProgressBar(context,attrSet);
        progressBar.setOpenGradient(true);
        assertEquals(true,progressBar.isOpenGradient());
    }

    @Test
    public void testBorderColor() {
        progressBar = new ZzHorizontalProgressBar(context,attrSet);
        progressBar.setBorderColor(0xffff001f);
        assertEquals(0xffff001f,progressBar.getBorderColor());
    }

}