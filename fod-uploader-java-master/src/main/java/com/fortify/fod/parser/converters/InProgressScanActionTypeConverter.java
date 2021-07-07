package com.fortify.fod.parser.converters;

import com.beust.jcommander.IStringConverter;
import com.fortify.fod.fodapi.FodEnums;

public class InProgressScanActionTypeConverter  implements IStringConverter<FodEnums.InProgressScanActionType> {
    @Override
    public FodEnums.InProgressScanActionType convert(String value) {
        try {
            int n = Integer.parseInt(value);
            return FodEnums.InProgressScanActionType.fromInt(n);
        } catch(NumberFormatException ex) {
            return FodEnums.InProgressScanActionType.valueOf(value);
        }
    }
}
