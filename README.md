# MoveAnimatorView

能够是view在两个位置之间做曲线运动的view

### 效果图：

![](http://7xjrms.com1.z0.glb.clouddn.com/SM-G9500_20171011170049_1.gif)



![](http://7xjrms.com1.z0.glb.clouddn.com/SM-G9500_20171011165925_1.gif)

### 接入方式：

Gradle:

```
compile 'whitelife.win.moveanimator:moveanimator:1.0'
```

maven:

```
<dependency>
  <groupId>whitelife.win.moveanimator</groupId>
  <artifactId>moveanimator</artifactId>
  <version>1.0</version>
  <type>pom</type>
</dependency>
```

### 使用方式：

```
//初始化
moveAnimateView=new MoveAnimateView(this);
animatorView=getLayoutInflater().inflate(R.layout.animview, (ViewGroup) moveAnimateView.getContentView(),false);

/**
*执行动画
*/
  public void start(View v){
        moveAnimateView.startAnimate(findViewById(R.id.v1),findViewById(R.id.v2),animatorView,getWindow().getDecorView());
    }

```



