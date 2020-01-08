package org.jake.write.time.wheel;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * Convert to 3 dtiles setting.
 *
 * @author zhuzz
 * @time 2019 /12/16 10:10:57
 */
@AllArgsConstructor
@Data
@Builder
@NoArgsConstructor
public class ConvertTo3DtilesSetting implements Serializable {

    
    /**
     * 开启光照
     */
    private Boolean nolight = false;
    /**
     * 强制双面渲染
     */
    private Boolean forceDoubleSide = false;
    /**
     * 贴图几何误差
     */
    private Integer textureGeometricErrorFactor = 16;

    /**
     * 空间切割方式，space
     */
    private String splitPriority = "space";
    /**
     * 最大切割数据
     */
    private Integer splitMaxDataSize = 40000000;
    /**
     * 切割单位，mesh
     */
    private String splitUnit = "mesh";


    /**
     * 经度
     */
    private Float longitude = 39.90691f;
    /**
     * 经度
     */
    private Float latitude = 116.39123f;
    /**
     * 旋转值X
     */
    private Float srsoriginX = 0f;
    /**
     * 旋转值Y
     */
    private Float srsoriginY = 0f;
    /**
     * 旋转值Z
     */
    private Float srsoriginZ = 0f;


    /**
     * 保存文件名
     */
    private Boolean savefilename = true;
    /**
     * 保存文件名
     */
    private Boolean saveobjectname = true;
    /**
     * 使用GBK编码
     */
    private Boolean encodeGBK = false;

    /**
     * simplifyMesh
     */
    private String simplifyMesh = "before";
    /**
     * colorRatio
     */
    private Integer colorRatio = 1;
    /**
     * geotransPlan
     */
    private Boolean geotransPlan = true;


    /**
     * 最小几何误差
     */
    private Float minGeometricError = 0.001f;
    /**
     * 包围盒半径几何误差
     */
    private Float boxRadius2GeometricError = 1f;
    /**
     * 下一个几何误差因子
     */
    private Float nextGeometricErrorFactor = 0.25f;
    /**
     * tile最大大小
     */
    private Float tileMaxDataSize = 2000000f;
    /**
     * tile最大大小
     */
    private Float simplifyFactor = 1f;

    /**
     * 网格压缩
     */
    private Boolean dracoCompression = true;
    /**
     * 纹理压缩
     */
    private Boolean crnCompression = true;


//    /**
//     * 输入路径.glb
//     */
    private String input;
//    /**
//     * 结果的输出路径.b3dm
//     */
//    private String output;
//    /**
//     * 文件名
//     */
//    private String filename = "123";

}
