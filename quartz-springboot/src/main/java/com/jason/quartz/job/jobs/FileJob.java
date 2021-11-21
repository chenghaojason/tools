package com.jason.quartz.job.jobs;

import com.jason.base.utils.DateUtil;
import org.quartz.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author WangChenHol
 * @date 2021-11-21 14:25
 **/
public class FileJob implements Job {
    private static final Logger logger = LoggerFactory.getLogger(FileJob.class);

    @Override
    public void execute(JobExecutionContext context) throws JobExecutionException {
        CronTrigger trigger = (CronTrigger) context.getTrigger();
        JobKey key = context.getJobDetail().getKey();
        logger.info("{}.{}，开始上传文件：{}，   cron={}", key.getGroup(), key.getName(), DateUtil.currDateStr(), trigger.getCronExpression());

    }
}
