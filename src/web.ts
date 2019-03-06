import { WebPlugin } from '@capacitor/core';
import { TtlockCapacitorPlugin } from './definitions';

export class TtlockCapacitorWeb extends WebPlugin implements TtlockCapacitorPlugin {
  constructor() {
    super({
      name: 'TtlockCapacitor',
      platforms: ['web', 'android']
    });
  }

  async echo(options: { value: string }): Promise<{value: string}> {
    console.log('ECHO', options);
    return options;
  }
}

const TtlockCapacitor = new TtlockCapacitorWeb();

export { TtlockCapacitor };
