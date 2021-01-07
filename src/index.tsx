import React from 'react'
import RCTFocusView from './RCTFocusView'
import {View, ViewProps} from 'react-native'

export type FocusViewType = {
  descendantFocusability: boolean;
};

const FocusView: React.FC<FocusViewType & ViewProps> = (
  {
    children,
    descendantFocusability,
    ...props
  },
) => (
  descendantFocusability ? (
    <RCTFocusView descendantFocusability={descendantFocusability} {...props}>
      {children}
    </RCTFocusView>
  ) : (
    <View {...props}>{children}</View>
  )
)


export default FocusView
