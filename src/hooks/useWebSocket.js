// src/hooks/useWebSocket.js
import { useEffect, useState } from 'react';
export function useWebSocket(url){
  const [ws, setWs] = useState(null);
  useEffect(()=>{ setWs(new WebSocket(url)); },[url]);
  return ws;
}