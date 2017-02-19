package com.spartajet.logtest.trace;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;

/**
 * @description
 * @create 2017-02-19 下午9:54
 * @email gxz04220427@163.com
 */
@Service
public class TraceGenerator {
    private Logger logger = LogManager.getLogger(TraceGenerator.class);

    @PostConstruct
    private void geneDebug() {
        logger.trace("this is a debug log");
    }
}
