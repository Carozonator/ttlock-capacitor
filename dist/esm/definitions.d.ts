declare global {
    interface PluginRegistry {
        TtlockCapacitor?: TtlockCapacitorPlugin;
    }
}
export interface TtlockCapacitorPlugin {
    echo(options: {
        value: string;
    }): Promise<{
        value: string;
    }>;
}
