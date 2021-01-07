import {Component} from 'react'
import {ViewProps} from 'react-native'

type FocusViewPropsCustom = {
  descendantFocusability: boolean;
}

export type FocusViewProps = ViewProps & FocusViewPropsCustom

declare class FocusView<P = {}> extends Component<FocusViewProps & P> {

}

export {FocusView}

export default FocusView
