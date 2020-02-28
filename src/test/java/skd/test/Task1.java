package skd.test;

import skd.chalba.common.Task;
import skd.chalba.common.TaskParams;
import skd.chalba.requests.ResponseData;
import skd.chalba.interfaces.ThreadCount;
import skd.chalba.interfaces.ThreadSpawnDelay;

/**
 * @author sapan.dang
 */

@ThreadCount(fromCsvWithoutHeaders = "input/dummycsvdata.csv")
@ThreadSpawnDelay(100)
public class Task1 extends Task {




    public Task1(TaskParams taskParams)
    {
        System.out.println("Started "+taskParams._ThreadIndex);
        System.out.println("ThreadName "+taskParams._TaskName);

    }

    @Override
    public void run() {
        super.run();
        System.out.println("Started thread...");

        ResponseData res =  requests.get("http://google.com");
        if(res!=null)
        {
            System.out.println("ResponseCode " +res.code);
        }

    }



}