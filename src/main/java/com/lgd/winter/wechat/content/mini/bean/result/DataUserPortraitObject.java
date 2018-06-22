package com.lgd.winter.wechat.content.mini.bean.result;

import lombok.Data;

import java.util.List;

/**
 * @author guochao
 * @since 1.0.0
 */
@Data
public class DataUserPortraitObject {
    private List<DataUserPortraitModel> province;
    private List<DataUserPortraitModel> city;
    private List<DataUserPortraitModel> genders;
    private List<DataUserPortraitModel> platforms;
    private List<DataUserPortraitModel> devices;
    private List<DataUserPortraitModel> ages;

}