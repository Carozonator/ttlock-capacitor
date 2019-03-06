import { WebPlugin } from '@capacitor/core';
import { TtlockCapacitorPlugin } from './definitions';
export declare class TtlockCapacitorWeb extends WebPlugin implements TtlockCapacitorPlugin {
    constructor();
    echo(options: {
        value: string;
    }): Promise<{
        value: string;
    }>;
}
declare const TtlockCapacitor: TtlockCapacitorWeb;
export { TtlockCapacitor };
