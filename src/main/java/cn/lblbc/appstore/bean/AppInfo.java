package cn.lblbc.appstore.bean;

import lombok.Data;

/**
 * 厦门大学计算机专业 | 前华为工程师
 * 专注《零基础学编程系列》  http://lblbc.cn/blog
 * 包含：Java | 安卓 | 前端 | Flutter | iOS | 小程序 | 鸿蒙
 * 公众号：蓝不蓝编程
 */
@Data
public class AppInfo {
    private int id;
    private String name;
    private String logoUrl;
    private String screenshotUrls;
    private String description;
    private String apkUrl;
    private String fileSize;
    private String downloadCount;
}
