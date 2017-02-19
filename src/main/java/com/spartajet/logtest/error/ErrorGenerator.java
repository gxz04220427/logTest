package com.spartajet.logtest.error;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

/**
 * @description
 * @create 2017-02-19 下午9:54
 * @email gxz04220427@163.com
 */
@Component
public class ErrorGenerator {
    private Logger logger = LogManager.getLogger(ErrorGenerator.class);

    @PostConstruct
    private void geneDebug() {
        logger.error("this is a error log");
    }
}
