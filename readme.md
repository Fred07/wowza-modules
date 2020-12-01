# Module AMLST

此為一個 wowza media engine plugin

## 使用方式

參考 wowza 官網上的 custom module 作法，下載 eclipse，安裝 wowza IDE 開發工具，建立 module 專案

將原始碼帶入，並針對實際應用的 wowza engine 的 java 版本進行 compile

將產生的 `.jar` 檔放入 wowza engine 上的 lib 資料夾中

重啟 wowza engine 之後，設定要啟用的 application module 配置即可
