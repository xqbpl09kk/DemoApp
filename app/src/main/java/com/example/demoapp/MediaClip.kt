package com.example.demoapp


import java.io.Serializable

/**
 * MediaClip视频片段数据结构(图片、视频)
 * @author chao.chen
 */
data class MediaClip(

        /** 片段index*/
    @JvmField
    internal var index: Int = 0,
        /** 片段错误code*/
    @JvmField
    internal var errCode: Int = 0,
        /** 片段类型：0：普通片段  1：用户通过新建功能加入的片段 2:手绘片段*/
    @JvmField
    internal var clipType: Int = 0,
        /** 是否转码过，如果转码过，就不再进行转码*/
    @JvmField
    internal var isTransCoded: Boolean = false,
        /** 片段路径*/
    @JvmField
    internal var path: String? = null,
        /** 用于图片Clip来缓存小图片的路径*/
    @JvmField
    internal var cacheImagePath: String? = null,
        /** 保存片段文件大小,用以简单判断片段是否被更改*/
    @JvmField
    internal var fileSize: Long = 0,
        /** 此片段是否静音*/
    @JvmField
    internal var isMute: Boolean = false,
        /** 片段时长*/
    @JvmField
    internal var duration: Long = 0,
        /** 片段临时设置时长*/
    @JvmField
    internal var durationTmp: Long = 0,
        /** 片段开始时间*/
    @JvmField
    internal var startTime: Long = 0,
        /** 片段临时设置开始时间*/
    @JvmField
    internal var startTimeTmp: Long = 0,
        /** 片段结束时间*/
    @JvmField
    internal var endTime: Long = 0,
        /** 片段临时设置结束时间*/
    @JvmField
    internal var endTimeTmp: Long = 0,
        /** 通过Ffmpeg校准关键帧后的时间*/
    @JvmField
    internal var ffmpegStartTime: Long = 0,
        /** 是否有视频片头(主题)*/
    @JvmField
    internal var isNewEngineHeadTailText: Boolean = false,
        /** 视频片头效果路径(主题)*/
    @JvmField
    internal var newEngineHeadEffectPath: String = "",
        /** 视频片头效果文字(主题)*/
    @JvmField
    internal var newEngineHeadEffectText: String = "",
        /** 录像背景音乐*/
        /** 片段宽度*/
    @JvmField
    internal var video_w: Int = 0,

        /** 片段高度*/
    @JvmField
    internal var video_h: Int = 0,

        /** 片段真实宽度*/
    @JvmField
    internal var video_w_real: Int = 0,

        /** 片段真实高度*/
    @JvmField
    internal var video_h_real: Int = 0,

        /** 用于缓存图片的真实宽度*/
    @JvmField
    internal var video_w_real_cache_image: Int = 0,

        /** 用于缓存图片的真实高度*/
    @JvmField
    internal var video_h_real_cache_image: Int = 0,

        /** 片段角度 0,1,2*/
    @JvmField
    internal var video_rotate: Int = 0,

        /** 用于图片位置调整用的参数 左上角坐标，截取宽高以及原始图片宽高、旋转角度*/
    @JvmField
    internal var topleftXLoc: Int = 0,

        /** 左上角坐标Y*/
    @JvmField
    internal var topleftYLoc: Int = 0,

        /** 截取宽*/
    @JvmField
    internal var adjustWidth: Int = 0,

        /** 截取高*/
    @JvmField
    internal var adjustHeight: Int = 0,

        /** 原始图片宽*/
    @JvmField
    internal var picWidth: Int = 0,

        /** 原始图片高*/
    @JvmField
    internal var picHeight: Int = 0,

        /** 旋转角度*/
    @JvmField
    internal var rotation: Int = 0,

        /** 方块编辑矩阵平移旋转缩放值*/
    @JvmField
    internal var lastMatrixValue: FloatArray = FloatArray(9),

        /** 方块编辑矩阵最后旋转角度*/
    @JvmField
    internal var lastRotation: Int = 0,

        /** 是否解码宽高被置换*/
    @JvmField
    internal var isFFRotation: Boolean = false,

        /** 是否缩放过片段*/
    @JvmField
    internal var isZoomClip: Boolean = false,

        /** 是否是追加片段*/
    @JvmField
    internal var isAppendClip: Boolean = false,

        /** 是否增加封面*/
    @JvmField
    internal var isAppendCover: Boolean = false,

    /** 转场效果*/
//    var fxTransEntityNew: FxTransEntityNew? = FxTransEntityNew()
    /** 滤镜效果*/
//    var fxFilterEntity: FxFilterEntity = FxFilterEntity()
        /** 视频快放/慢放功能：0：无 ，1-1/4X，2-1/2X, 3-2X, 4-4X*/
    @JvmField
    internal var ffVideoRate: Int = 0,

        /** 是否是编辑倒放导出视频*/
    @JvmField
    internal var isVideoReverse: Boolean = false,

        /** 是否从摄像拍摄马上预览的视频*/
    @JvmField
    internal var isCameraClip: Boolean = false,

        /** 0,表示视频原片段。 1.表示添加视频片段图片按钮*/
    @JvmField
    internal var addMadiaClip: Int = 0,

        /** 片段调节参数 亮度*/
    @JvmField
    internal var luminanceAdjustVal: Float = 0f,

        /** 片段调节参数 对比度*/
    @JvmField
    internal var contrastAdjustVal: Float = 0f,

        /** 片段调节参数 饱和度*/
    @JvmField
    internal var saturationAdjustVal: Float = 0f,

        /** 片段调节参数 锐化*/
    @JvmField
    internal var sharpnessAdjustVal: Float = 0f,

        /** 片段调节参数 色温*/
    @JvmField
    internal var temperatureAdjustVal: Float = 0f,

        /** 片段调节参数 色调*/
    @JvmField
    internal var hueAdjustVal: Float = 0f,

        /** 片段调节参数 高光*/
    @JvmField
    internal var shadowHighlightAdjustVal: Float = 0f,

        /** 片段调节参数 暗角*/
    @JvmField
    internal var vignetteAdjustVal: Float = 0f,

        /** 是否为视频collage类型片段*/
    @JvmField
    internal var isVideoCollageClip: Boolean = false,

        /** 视频collage效果文件的绝对路径*/
    @JvmField
    internal var videoCollageEffectPath: String? = null,

        /** collage类型视频，音频是否生效　true:音频生效视频片段，导出的视频有声音　false:音频失效视频片段，导出视频只有画面无声音*/
    @JvmField
    internal var isAudioValid: Boolean = false,
    /** collage用于保存各个片段的属性*/
//    var videoCollageProperties: ArrayList<FxVideoCollageProperty>? = null
        /** 片段（视频及图片）做左右镜像，默认false*/
    @JvmField
    internal var isClipMirrorH: Boolean = false,

        /** 自定义背景图片模糊度*/
    @JvmField
    internal var imageBKBlurValue: Int = 0,

        /** 自定义背景图片路径*/
    @JvmField
    internal var imageBKPath: String? = null,

        /** 是否开启自定义背景颜色功能*/
    @JvmField
    internal var isUseColor: Boolean = false,

        /** 自定义颜色背景red分量*/
    @JvmField
    internal var red_value: Float = -1f,

        /** 自定义颜色背景green分量*/
    @JvmField
    internal var green_value: Float = -1f,

        /** 自定义颜色背景blue分量*/
    @JvmField
    internal var blue_value: Float = -1f,

        /** 视频音量*/
    @JvmField
    internal var videoVolume: Int = 100,

        /** 视频音量备份，用于静音后恢复原音量*/
    @JvmField
    internal var videoVolume_bak: Int = 100,

        /** 是否操作过区域裁切*/
    @JvmField
    internal var isOperateZoneClip: Boolean = false,

        /** 视频裁切 宽度*/
    @JvmField
    internal var clipVideoWidth: Int = 100,

        /** 视频裁切 高度*/
    @JvmField
    internal var clipVideoHeight: Int = 100,

        /** 视频裁切 原始宽度*/
    @JvmField
    internal var clipOldVideoWidth: Int = 100,

        /** 视频裁切 原始高度*/
    @JvmField
    internal var clipOldVideoHeight: Int = 100,

        /** 片段快慢放速度*/
    @JvmField
    internal var videoPlaySpeed: Float = 1.0f,

        /** 片段快慢放速度临时值*/
    @JvmField
    internal var videoPlaySpeedTmp: Float = 1.0f,

    /**----------------------FX渲染参数-------------------------------------*/
        /** 滤镜明亮度*/
    @JvmField
    internal val filterPower: Float = 1.0f,

        /** 片段渲染宽度，单位像素*/
    @JvmField
    internal var width: Int = 0,

        /** 片段渲染高度，单位像素*/
    @JvmField
    internal var height: Int = 0,

        /** 特效显示时长，单位秒*/
    @JvmField
    internal var effectDuration: Float = 1.0f,

        /** 特效开始的全局时间，单位秒*/
    @JvmField
    internal var gVideoEffectStartTime: Float = 0f,

        /** 特效结束的全局时间，单位秒*/
    @JvmField
    internal var gVideoEffectEndTime: Float = 0f,

        /** Clip开始的全局时间,如果是图片则包含Effect时长，视频时为纯视频全局开始时间，单位秒*/
    @JvmField
    internal var gVideoClipStartTime: Float = 0f,

        /** Clip结束的全局时间,如果是图片则包含Effect时长，视频时为纯视频全局结束时间，单位秒*/
    @JvmField
    internal var gVideoClipEndTime: Float = 0f,

        /** 视频剪切开始时间，单位秒*/
    @JvmField
    internal var trimStartTime: Float = 0f,

        /** 视频剪切结束时间，单位秒*/
    @JvmField
    internal var trimEndTime: Float = 0f,

        /** 旋转角度改动：退回不需要方块瞬间编辑兼容之前版本：0 90 180 270*/
    @JvmField
    internal var rotationNew: Int = 0,

        /** 是否有转场特效*/
    @JvmField
    internal var hasEffect: Boolean = false //
) : Serializable {
    /**
     * 设置片段（视频及图片）做左右镜像
     * @param value
     */
    fun setIsClipMirrorH(value: Boolean) {
        isClipMirrorH = value
    }

}