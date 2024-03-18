package com.dreaming.design.solve;

import com.dreaming.design.solve.colleague.impl.CDDriver;
import com.dreaming.design.solve.colleague.impl.CPU;
import com.dreaming.design.solve.colleague.impl.SoundCard;
import com.dreaming.design.solve.colleague.impl.VideoCard;
import com.dreaming.design.solve.mediator.impl.MotherBoard;

/**
 * 使用电脑来看电影
 *
 * 为了演示，考虑一个稍微具体点的功能。在日常生活中，我们经常使用电脑来看电影，把这个过程描述出来，
 * 这里仅仅考虑正常的情况，也就是有主板的情况，简化后假定会有如下的交互过程。
 *
 * 首先是光驱要读取光盘上的数据，然后告诉主板，它的状态改变了。
 * 主板去得到光驱的数据，把这些数据交给CPU进行分析处理。
 * CPU处理完后，把数据分成了视频数据和音频数据，通知主板，它处理完了。
 * 主板去得到CPU 处理过后的数据，分别把数据交给显卡和声卡，去显示出视频和发出声音。
 *
 * 当然这是一个持续的、不断重复的过程，从而形成不间断的视频和声音。
 * 具体的运行过程不在讨论之列，假设就有如上简单的交互关系就可以了。
 * 也就是说想看电影，把光盘放入光驱,光驱开始读盘，就可以看电影了。
 *
 * 现在要求使用程序把这个过程描述出来，该如何具体实现呢?
 *
 */
public class Main {
    public static void main(String[] args) {
        //1:创建中介者——主板对象
        MotherBoard mediator = new MotherBoard();
        //2:创建同事类
        CDDriver cd = new CDDriver (mediator);
        CPU cpu = new CPU(mediator);
        VideoCard vc = new VideoCard (mediator);
        SoundCard sc = new SoundCard(mediator);
        //3:让中介者知道所有的同事
        mediator.setCdDriver(cd);mediator.setCpu (cpu);
        mediator.setVideoCard(vc);
        mediator.setSoundCard(sc);
        //4:开始看电影,把光盘放入光驱,光驱开始读盘
        cd.readCD();
    }
}
