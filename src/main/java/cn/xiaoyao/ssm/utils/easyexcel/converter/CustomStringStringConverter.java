package cn.xiaoyao.ssm.utils.easyexcel.converter;

/**
 * @author xiaoyao
 * @date 2022/5/14
 */
import com.alibaba.excel.converters.Converter;
import com.alibaba.excel.converters.ReadConverterContext;
import com.alibaba.excel.converters.WriteConverterContext;
import com.alibaba.excel.enums.CellDataTypeEnum;
import com.alibaba.excel.metadata.data.WriteCellData;
import com.alibaba.excel.util.NumberUtils;

import java.text.ParseException;

/**
 * String and string converter
 *
 * @author Jiaju Zhuang
 */
public class CustomStringStringConverter implements Converter<Integer> {
    @Override
    public Class<?> supportJavaTypeKey() {
        return String.class;
    }

    @Override
    public CellDataTypeEnum supportExcelTypeKey() {
        return CellDataTypeEnum.STRING;
    }

    /**
     * 这里是读的时候会调用 不用管
     *
     * @return
     */
    @Override
    public Integer convertToJavaData(ReadConverterContext<?> context) throws ParseException {
        return  NumberUtils.parseInteger(context.getReadCellData().getNumberValue().toString(),context.getContentProperty());
    }

    /**
     * 这里是写的时候会调用 不用管
     *
     * @return
     */
    @Override
    public WriteCellData<?> convertToExcelData(WriteConverterContext<Integer> context) {
        String value = "";
        if (1==context.getValue()) {
            value = "男";
        }else if (0==context.getValue()){
            value = "女";
        }
        return new WriteCellData<>(value);
    }

}
